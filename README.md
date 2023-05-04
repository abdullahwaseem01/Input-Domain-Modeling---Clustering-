# Machine-Learning-Data-Clustering
Java machine learning to perform data clustering. Compare the performance of three clustering algorithms using the Iris flower dataset.

## Algorithms
- KMeans
- Density Based Spatial Clustering
- KMediods

## Performance Evaluation
#### AICScore: 
This method evaluates the overall fitness of the model with the data
set. It weighs on parsimony, that simpler models are more effective than more
complex models. It evaluates the models based on the fitness, how well the data
fits with the model, and the complexity, how many parameters are used to
describe the model. This evaluation method was chosen because it gives an
insight as to which model is the best fit for the dataset by giving a lower score for
the model that had the best balance between complicity and accuracy.

#### Hybrid Pairwise Similarities: 
This evaluation method is used to evaluate the
similarity in pairs of data points in a cluster. This evaluation method was used
because it uses multiple metrics such as euclidean distance, cosine similarity,
and correlation coefficient to benchmark the relationship between different data
points.

#### GPlus: 

This evaluation method compares the similarity of the objects in a cluster
to the difference in other clusters. This is why it is initialized with Euclidean
distance since it is used to calculate the distance in the clustering models. The
reason this evaluation method was chosen was because it designed the handle
datasets with a known number of classes.

## Evaluations
#### KMeans:
- __AICScore:__ 9938.781284138158
- __Hybrid Pairwise Similarities:__ 1.019093657866949
- __GPlus:__ 4.385380090967006E-5
#### Density Based Spatial Clustering:
- __AICScore:__ 9708.693384443968
- __Hybrid Pairwise Similarities:__ 1.018305789497345
- __GPlus:__ 6.638665117644806E-5
#### KMedoids:
- __AICScore:__ 9927.020769913317
- __Hybrid Pairwise Similarities:__ 1.0194096168845206
- __GPlus:__ 4.431828601791711E-5
