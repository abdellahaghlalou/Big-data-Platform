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

# Use case 1 : Twitter in morocco analytics:

The profiles in question are 2M.ma, 1337, OCP Group, Agence MAP,59
Hespress, Le360, MEDI1TV, El Otmani Saaddine, ONCF and ministry of health morocco

## Visualitsation result : 

<img src="" alt=””>

# Use case 2 : Crypto markets and Twitter sentiment:

The structure of this data is similar to the one used in the first use case. This one has
only timeline tweets scraped from 7 profiles of crypto analysts and experts in twitter. We
chose profiles that are not overly biased and don’t always talk about crypto in a positive
or a negative way. We want data to reflect the facts as much as possible so the sentiment
analysis can be insightful. The profiles that we chose are : @WClementeIII, @nic__carter,
@BTC_Archive, @MHiesboeck, @crypto_birb, @rektcapital and @TheCryptoLark. We used
tweets from 25/10/2021 to 23/06/2022, an 8 months period.

Now we chose Bitcoin and Ethereum as the digital currencies to focus on, so we made sure
to choose twitter profiles that discuss these coins frequently. The reason we chose these two
coins is because : first, they are the most dominant two coins in the crypto market which makes
them constantly discussed in social media. and secondly, we can find popular crypto experts
that discuss these coins easier.

Crypto historical prices data : 
Data was retrieved from the website yahoo finance for both Bitcoin and Ethereum, for the
same 8 months period from 25/10/2021 to 23/06/2022.
