package Baitap.JavaCollectionFramework.ArrayList_LinkedList;

import java.util.*;

public class ProductManager<E> {

    private static int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] products;

    public ProductManager() {
        products = new Product[DEFAULT_CAPACITY];
    }

    public ProductManager(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Không hợp lệ!!!");
        } else {
            products = new Product[capacity];
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > products.length) {
            int newCapacity = Math.max(DEFAULT_CAPACITY, products.length * 2);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            products = Arrays.copyOf(products, newCapacity);
        }

    }

    public void add() {
        ensureCapacity(size + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên của sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá tiền của sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        products[size] = product;
        size++;
        if (add1()) {
            System.out.println("Thêm sản phẩm thành công");
        } else {
            System.out.println("Thêm mới thất bại!");
        }
    }

    public boolean add1() {
        if (size != products.length) {
            return true;
        }
        return false;
    }

    public void remove() {
        System.out.println("Nhập ID sản Phẩm muốn xóa: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        index = index - 1;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }

        E removeProducts = (E) products[index];
        System.arraycopy(products, index + 1, products, index, size - index - 1);
        products[size - 1] = null;
    }


    public void displayProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public void editProduct() {
        System.out.println("Nhập ID sản phẩm muốn sửa: ");
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());

        index = index - 1;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        System.out.println(products[index]);
        System.out.print("Sửa tên sảm phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Sửa giá tiền sảm phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        products[index] = edit(index + 1, name, price);
        System.out.println("Đã sửa thành công!");
    }

    public E edit(int index, String name, double price) {
        Product product = new Product();
        product.setId(index);
        product.setName(name);
        product.setPrice(price);

        product = new Product(product.getId(), product.getName(), product.getPrice());
        return (E) product;
    }

    public void seach(String seach) {
        Product p = new Product();

        for (int i = 0; i < size; i++) {
            p = (Product) products[i];
            if (p.getName().equals(seach)) {
                System.out.println(products[i]);
            }
        }
    }

    public static void sortByPrice(Product[] products) {
        // Using Comparator to compare products based on price
        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        };

        // Sorting products array using priceComparator
        Arrays.sort(products, priceComparator);
    }

    public void sortByPrice() {

        Product[] tempProducts = (Product[]) Arrays.copyOf(products, size);


        ProductManager.sortByPrice(tempProducts);


        System.arraycopy(tempProducts, 0, products, 0, size);
    }

}


