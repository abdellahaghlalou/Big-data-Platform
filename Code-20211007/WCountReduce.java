/*
  --
  TP: Programme MapReduce : compteur d'occurences de mots (word count).
  --
  WCountReduce.java: classe REDUCE.
*/
package org.hadoop.wordcount;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;
import java.util.Iterator;
import java.io.IOException;



public class WCountReduce extends Reducer<Text, IntWritable, Text, Text>
{
	// Les arguments de la fonction reduce : la clé key, un Iterable de toutes les valeurs
	// qui sont associées à la clé en question, et le contexte Hadoop (un handle qui nous permet de renvoyer le résultat à Hadoop).
  public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
	{
		// Pour parcourir toutes les valeurs associées à la clé fournie.
		Iterator<IntWritable> i=values.iterator();
		int count=0;
		while(i.hasNext())   // Pour chaque valeur
			count+=i.next().get();    // ...on l'ajoute au total.
		// On renvoie le couple (clé;valeur) constitué de notre clé key et du total, au format Text.
		context.write(key, new Text(count+" occurences."));
  }
}
