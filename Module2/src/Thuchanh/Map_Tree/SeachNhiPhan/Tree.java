package Thuchanh.Map_Tree.SeachNhiPhan;

public interface Tree<E> {

    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
