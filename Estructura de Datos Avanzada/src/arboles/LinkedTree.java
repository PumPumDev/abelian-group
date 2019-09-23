package arboles;
import java.util.*;

public class LinkedTree<E> implements Tree<E>{

    private class TreeNode<E> implements Position<E>{

        private E element;
        private TreeNode<E> parent;
        private List<TreeNode<E>> children;
        private LinkedTree<E> myTree;

        public TreeNode(E element, TreeNode<E> parent, List<TreeNode<E>> children, LinkedTree<E> myTree) {
            this.element = element;
            this.parent = parent;
            this.children = children;
            this.myTree = myTree;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public TreeNode<E> getParent() {
            return parent;
        }

        public void setParent(TreeNode<E> parent) {
            this.parent = parent;
        }

        public List<TreeNode<E>> getChildren() {
            return children;
        }

        public void setChildren(List<TreeNode<E>> children) {
            this.children = children;
        }

        public LinkedTree<E> getMyTree() {
            return myTree;
        }

        public void setMyTree(LinkedTree<E> myTree) {
            this.myTree = myTree;
        }

        @Override
        public E getValue() {
            return this.element;
        }
    }

    private TreeNode<E> root;
    private int size;

    private TreeNode<E> checkPosition(Position<E> p) throws RuntimeException{

        if(p == null || !(p instanceof TreeNode))   //TODO Se puede eliminar la primera comprobacion.
            throw new RuntimeException("The position is invalid");

        TreeNode<E> aux = (TreeNode<E>) p;

        if(aux.myTree != this)
            throw new RuntimeException("This is not the tree you're looking for...");

        return aux;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isLeaf(Position<E> p) throws RuntimeException{
        TreeNode<E> node = checkPosition(p);

        return node.getChildren().isEmpty();
    }

    @Override
    public Position<E> addRoot(E e) throws RuntimeException {

        if(this.isEmpty())
            throw new RuntimeException("The tree has already a root.");

        this.size = 1;
        this.root = new TreeNode<E>(e,null, new LinkedList<TreeNode<E>>(),this);

        return this.root;
    }

    @Override
    public Position<E> add(Position<E> p, E e) throws RuntimeException {
        TreeNode<E> parent = checkPosition(p);
        TreeNode<E> newNode = new TreeNode<E>(e,parent,new LinkedList<TreeNode<E>>(), this);

        parent.getChildren().add(newNode);

        return newNode;
    }
}
