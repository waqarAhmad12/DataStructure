package com.waqar.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	private LinkedList<Integer> adj[];
	public Graph(int v)
	{
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source , int des)
	{
		adj[source].add(des);
		adj[des].add(source);
	}
	
	public int bfs(int source,int des)
	{
		boolean vis[] = new boolean[adj.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		int parent[] = new int[adj.length];
		queue.offer(source);
		parent[source] = -1;
		vis[source] = true;
		while(!queue.isEmpty())
		{
			int n = queue.poll();
			if(n==des)break;
			for(int neb :adj[n])
			{
				
				if(!vis[neb])
				{
					queue.offer(neb);
					vis[neb] = true;
					parent[neb] = n;
				}
			}
		}
		
		int i=des;
		int count=0;
		while(parent[i]!=-1)
		{count++;
			System.out.print(i+" ->");
			i=parent[i];
		}
		System.out.println(source);
		return count;
	}
	
	public boolean dfs(int source , int des)
	{
		Stack<Integer> st = new Stack<>();
		boolean[] vis = new boolean[adj.length];
		st.push(source);
		vis[source] = true;
		while(!st.isEmpty())
		{
			int curr = st.pop();
			if(curr == des)return true;
			for(int neb:adj[curr])
			{
				if(!vis[neb])
				{
					vis[neb] = true;
					st.push(neb);
				}
				
			}
		}
		return false;
	}
}
