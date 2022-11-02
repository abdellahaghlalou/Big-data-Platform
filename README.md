# Big Data Platform

This project aims to design and build a big data platform capable of receiving different
types of data (batch data or streaming data) from different sources and in different formats
(SQL, noSQL, unstructured, etc.), and storing them in their raw format inside the HDFS data
lake. the latter is executed in cluster mode, which means a distributed architecture capable
of handling large amounts of data and providing high availability that allows the platform to
operate continuously without failure. The data can then be processed as we wish, indexed and
visualized either in batches or in real time depending on the type of data.
To test what the platform is capable of doing, I chose two use cases for analytics to apply
using this platform. The first use case was exploratory analysis of Moroccan twitter where we
process tweets made by Moroccans and visualize the results on our platform. The second use
case was conducted on the crypto markets, the aim was to investigate the relationship between
the price changes of crypto assets (Bitcoin and Ethereum) and twitter sentiment of , we tried
to find out if there exists any correlation between these two variables and draw out insightful
conclusions from charts we visualized in the platform.
