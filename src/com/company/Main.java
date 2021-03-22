package com.company;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Products.txt

        ProductArray pBubbleSort1= new ProductArray(30);
        FileOperaitons.readFile(pBubbleSort1,"Products.txt",false);
        pBubbleSort1.bubbleSort();
        System.out.println("The cost of Bubble Sort is: "+pBubbleSort1.getSortCost());

        ProductArray pSelectionSort1= new ProductArray(30);
        FileOperaitons.readFile(pSelectionSort1,"Products.txt",false);
        pSelectionSort1.selectionSort();
        System.out.println("The cost of Selection Sort is :"+pSelectionSort1.getSortCost());

        ProductArray pInsertionSort1= new ProductArray(30);
        FileOperaitons.readFile(pInsertionSort1,"Products.txt",false);
        pInsertionSort1.insertionSort();
        System.out.println("The cost of Insertion Sort is: "+pInsertionSort1.getSortCost());

        ProductArray pSortedInsert1 = new ProductArray(30);
        FileOperaitons.readFile(pSortedInsert1,"Products.txt",true);
        System.out.println("The cost of Sorted Insert is : "+pSortedInsert1.getSortCost());


        System.out.println("*******************************************************************************");


        //ProductList.txt

        ProductArray pBubbleSort= new ProductArray(30000);
        FileOperaitons.readFile(pBubbleSort,"ProductList.txt",false);
        pBubbleSort.bubbleSort();
        System.out.println("The cost of Bubble Sort is: "+pBubbleSort.getSortCost());

        ProductArray pSelectionSort= new ProductArray(30000);
        FileOperaitons.readFile(pSelectionSort,"ProductList.txt",false);
        pSelectionSort.selectionSort();
        System.out.println("The cost of Selection Sort is :"+pSelectionSort.getSortCost());

        ProductArray pInsertionSort= new ProductArray(30000);
        FileOperaitons.readFile(pInsertionSort,"ProductList.txt",false);
        pInsertionSort.insertionSort();
        System.out.println("The cost of Insertion Sort is: "+pInsertionSort.getSortCost());

        ProductArray pSortedInsert = new ProductArray(30000);
        FileOperaitons.readFile(pSortedInsert,"ProductList.txt",true);
        System.out.println("The cost of Sorted Insert is : "+pSortedInsert.getSortCost());




    }
}
