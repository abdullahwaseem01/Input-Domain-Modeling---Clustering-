import gnu.trove.impl.sync.TSynchronizedShortByteMap;
import net.sf.javaml.clustering.*;
import net.sf.javaml.clustering.evaluation.*;
import net.sf.javaml.core.*;
import net.sf.javaml.distance.*;
import net.sf.javaml.tools.data.FileHandler;
import java.io.File;

public class main {

    private static void clusters(Dataset[] clusters) {
        for (int i = 0; i < clusters.length; i++) {
            System.out.println("Cluster " + i + ":");
            for (int j = 0; j < clusters[i].size(); j++) {
                System.out.println(clusters[i].get(j));
            }
        }
    }

    private static void algorithimEval(Dataset[] cluster) {
        DistanceMeasure EuclideanDistance = new EuclideanDistance();
        ClusterEvaluation HybridPairwiseSimilarities = new HybridPairwiseSimilarities();
        ClusterEvaluation AICScore = new AICScore();
        ClusterEvaluation GPlus = new GPlus(EuclideanDistance);


        double HybridPairwiseSimilaritiesScore = HybridPairwiseSimilarities.score(cluster);
        double AICScoreScore = AICScore.score(cluster);
        double GPlusScore = GPlus.score(cluster);

        System.out.println("AICScore: " + AICScoreScore);
        System.out.println("Hybrid Pairwise Similarities: " + HybridPairwiseSimilaritiesScore);
        System.out.println("GPlus: " + GPlusScore);
        System.out.println();



    }
    public static void main(String[] args) throws Exception {
        Dataset irisData = FileHandler.loadDataset(new File("src/main/java/iris.data"), 4, ",");

        //KMeans
        Clusterer KMeans = new KMeans();
        Dataset[] KMeansClusters = KMeans.cluster(irisData);
        System.out.println("KMeans:");
        clusters(KMeansClusters);

        //Density Based Spatial Clustering
        Clusterer DensityBasedSpatialClustering = new DensityBasedSpatialClustering();
        Dataset[] DensityBasedSpatialClusteringClusters = DensityBasedSpatialClustering.cluster(irisData);
        System.out.println("Density Based Spatial Clustering:");
        clusters(DensityBasedSpatialClusteringClusters);

        //KMedoids
        Clusterer KMedoids = new KMedoids();
        Dataset[] KMedoidsClusters = KMedoids.cluster(irisData);
        System.out.println("KMedoids:");
        clusters(KMedoidsClusters);

        //Cluster Evaluation Outputs
        System.out.println("Evaluation:");
        System.out.println("KMeans:");
        algorithimEval(KMeansClusters);
        System.out.println("Density Based Spatial Clustering:");
        algorithimEval(DensityBasedSpatialClusteringClusters);
        System.out.println("KMedoids:");
        algorithimEval(KMedoidsClusters);
    }
    

}

