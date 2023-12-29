package CS0045Fall2023;

public class TestStoreSaleItemList {
    public static void main(String[] args) {

        AList<StoreSaleItem> storeSaleItemList = new AList<>(25);

        StoreSaleItem item1 = new StoreSaleItem(new StoreItem("Dinner Table", 18453), 349.99, 10);
        storeSaleItemList.add(item1);
        StoreSaleItem item2 = new StoreSaleItem(new StoreItem("Bay Window", 16534), 2345.00, 5);
        storeSaleItemList.add(item2);
        StoreSaleItem item3 = new StoreSaleItem(new StoreItem("Stool", 26123), 139.95, 12);
        storeSaleItemList.add(item3);
        StoreSaleItem item4 = new StoreSaleItem(new StoreItem("Lamp", 21000), 39.99, 15);
        storeSaleItemList.add(item4);
        StoreSaleItem item5 = new StoreSaleItem(new StoreItem("Couch", 17564), 999.49, 3);
        storeSaleItemList.add(item5);

        StoreSaleItem newItem = new StoreSaleItem(new StoreItem("Footstool", 28162), 79.99, 13);

        storeSaleItemList.add(2, newItem);

        storeSaleItemList.remove(3);

        StoreSaleItem replacementItem = new StoreSaleItem(new StoreItem("Large Rug", 19653), 199.99, 4);
        storeSaleItemList.replace(1, replacementItem);


        StoreSaleItem temp = storeSaleItemList.getEntry(1);

        storeSaleItemList.replace(1, storeSaleItemList.getEntry(5));

        storeSaleItemList.replace(5, temp);

        StoreSaleItem storeSaleItem4 = storeSaleItemList.getEntry(4);
        storeSaleItem4.getStoreItem().setID(11233);

        StoreSaleItem storeSaleItem5 = storeSaleItemList.getEntry(5);
        storeSaleItem5.setPrice(209.99);

        for (int i = 1; i <= storeSaleItemList.getLength(); i++) {
            StoreSaleItem item = storeSaleItemList.getEntry(i);
            System.out.println(item);
        }
    }
}

