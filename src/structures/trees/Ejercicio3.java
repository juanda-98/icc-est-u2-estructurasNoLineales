package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;

public class Ejercicio3 {
    public List<List<Integer>> listLevels(Node<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node<Integer> node = queue.poll();
                level.add(node.getValue());

                if (node.getLeft() != null) queue.add(node.getLeft());
                if (node.getRight() != null) queue.add(node.getRight());
            }

            result.add(level);
        }

        return result;
    }
}
