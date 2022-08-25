/*
 * package graph;
 * 
 * public class CheckBipartite {
 * 
 * 
 * }
 * 
 * public class Solution {
 * 
 * public int solve(int A, int[][] B) { int n = A; // initialize colors array
 * with -1 int[] color = new int[n]; Arrays.fill(color, -1);
 * 
 * // step 1- build adjacency list List<List<Integer>> list =
 * buildAdjacencyList(n, B);
 * 
 * 
 * for (int i = 0; i < n; i++) { // this loop is required if there are multiple
 * connected components if (color[i] == -1) { // mark source as visited and give
 * one of the color color[i] = 1; if (!isBipartiteGraph(i, list, color)) {
 * return 0; } } } return 1; }
 * 
 * // DFS traversal to check if given graph is Bipartite private boolean
 * isBipartiteGraph(int source, List<List<Integer>> list, int[] color) {
 * 
 * List<Integer> neighbors = list.get(source); for (int i = 0; i <
 * neighbors.size(); i++) { int currNode = neighbors.get(i); if (color[currNode]
 * == -1) { // if not already visited, give opposite color to neighbor
 * color[currNode] = color[source] ^ 1; if (!isBipartiteGraph(currNode, list,
 * color)) { return false; } } if (color[currNode] == color[source]) { // if any
 * of the neighbors have same color, then it is not bipartite graph return
 * false; } } return true; }
 * 
 * // build adjacency list for undirected graph private List<List<Integer>>
 * buildAdjacencyList(int n, int[][] B) { List<List<Integer>> list = new
 * ArrayList<List<Integer>>(); for (int i = 0; i < n; i++) { list.add(new
 * ArrayList<Integer>()); } for (int i = 0; i < B.length; i++) { int u =
 * B[i][0]; int v = B[i][1]; list.get(u).add(v); list.get(v).add(u); } return
 * list; } }
 */