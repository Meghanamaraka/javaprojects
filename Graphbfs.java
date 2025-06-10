package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graphbfs {
	public static void main(String[] args) {
		Map<String, List<String>> graph = new HashMap<>();
		graph.put("entrance connect", Arrays.asList("reptile house","bird sanctuary","mammal zone"));
		graph.put("reptile house",Arrays.asList("snakepit"));
		graph.put("bird sanctuary",Arrays.asList("parrot pavilion"));
		graph.put("mammal zone",Arrays.asList("lion den","elephant enclosure"));
		
	    graph.put("snakepit", new ArrayList<>());
        graph.put("parrot pavilion", new ArrayList<>());
        graph.put("lion den", new ArrayList<>());
        graph.put("elephant enclosure", new ArrayList<>());
        
        
        System.out.println("Exploring the zone using BFS starting from starting from entra:");
        bfs(graph, "entrance connect");
    }

    public static void bfs(Map<String, List<String>> graph, String startRoom) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(startRoom);
        visited.add(startRoom);

        while (!queue.isEmpty()) {
        	String currentRoom = queue.poll();
            System.out.println("Visited: " + currentRoom);

            
            for (String neighbor:graph.get(currentRoom)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}

