import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testContainsValue(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        root.left = new BinaryTreeNode<Integer>(5);
        root.right = new BinaryTreeNode<Integer>(15);

        boolean result = (BstSearch.contains(root,5));

        assertTrue(result);
    }

     @Test
    public void notContainsValue(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        root.left = new BinaryTreeNode<Integer>(5);
        root.right = new BinaryTreeNode<Integer>(15);

        boolean result = (BstSearch.contains(root,8));

        assertFalse(result);
    }
}
