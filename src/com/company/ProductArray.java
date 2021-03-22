//Halit Burak Yeşildal 18050111043
package com.company;

public class ProductArray {
    private int size;
    private Product[] productArray=null;
    private int lastIndex=0;
    private int sortCost=0;


    public ProductArray(int size) {
        this.size = size;
        productArray = new Product[size];
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public int getSortCost() {
        return sortCost;
    }

    public void setSortCost(int sortCost) {
        this.sortCost = sortCost;
    }

    //searches by name
    public int search(String name){
        for(int i=0;i<lastIndex;i++)
            if(productArray[i].getName().equalsIgnoreCase(name))
                return i;
        return -1;
    }

    //if Last index is less than size you can insert.
    public void insert(Product p){
       if(lastIndex<size)
            productArray[lastIndex++]=p;
       else
           System.out.println("Array is full...");
    }
    //Todo: sortedInsert i kontrol et
    //s1.compareTo(s2)<0 means s1 must come before s2
    public void sortedInsert(Product p){
        Product tempP;
        if(lastIndex==0) {
            productArray[lastIndex++] = p;
            sortCost++;
        }
        else if(lastIndex<size)
            for(int i=0;i<lastIndex;i++){
                sortCost++;
                if(p.getName().compareTo(productArray[i].getName())<0){
                    for(int j=lastIndex-1;j>i-1;j--){
                        sortCost++;
                        productArray[j+1]=productArray[j];
                        sortCost++;
                    }
                    lastIndex++;
                    productArray[i]=p;
                    sortCost++;
                    break;
                }
                else if(i==lastIndex-1){
                    productArray[lastIndex++]=p;
                    sortCost++;
                    break;
                }

        }
        else
            System.out.println("Array is full...");

    }

    public void bubbleSort(){
        Product tempP;
        int len = lastIndex;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++){
                sortCost++; // Counts the loop
                if (productArray[j].getName().compareTo(productArray[j+1].getName()) > 0)
                {
                    // swap arr[j+1] and arr[j]
                    tempP = productArray[j];
                    sortCost++; // Counts the operation of the array
                    productArray[j] = productArray[j+1];
                    sortCost++; // Counts the operation of the array
                    productArray[j+1] = tempP;
                    sortCost++; // Counts the operation of the array
                }
            }
        }
    }

    public void insertionSort(){
        int n = lastIndex;
        for (int i = 1; i < n; ++i) {

            Product key = productArray[i];
            sortCost++;
            int j = i - 1;

            while (j >= 0 && productArray[j].getName().compareTo(key.getName()) >0) {
                sortCost++;
                productArray[j + 1] = productArray[j];
                sortCost++;
                j = j - 1;
            }
            productArray[j + 1] = key;
            sortCost++;
        }

    }


    public void selectionSort(){
        int n = lastIndex;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            //sortCost++;
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                sortCost++;
                if (productArray[j].getName().compareTo(productArray[min_idx].getName()) < 0)
                    min_idx = j;
            }
            // Swap the found minimum element with the first
            // element
            Product temp = productArray[min_idx];
            sortCost++;
            productArray[min_idx] = productArray[i];
            sortCost++;
            productArray[i] = temp;
            sortCost++;

        }

    }

    //Displays all products.
    public void display(){
        for(int i=0;i<lastIndex;i++ )
            System.out.println(productArray[i].toString());
    }

    //delete product by name
    public  void delete(String name){
        boolean deleted=false;
        int index = search(name);
        if(index!=-1){
            for(int i=index;i<lastIndex;i++){
                productArray[i]=productArray[i+1];
            }
            deleted=true;
            System.out.println("This item deleted successfully");
            lastIndex--;
        }

        if(!deleted)
            System.out.println("That item could not find your array");

    }


}
