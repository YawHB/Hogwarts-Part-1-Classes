package edu.hogwarts;

import java.util.Arrays;



    public class DynamicArray {

        private int size = 0;
        private int growSize = 5;

        private final int INITIAL_SIZE = 6;
        private HogwartsStudent[] array = new HogwartsStudent[INITIAL_SIZE];


        public void add(HogwartsStudent person) {
            if(array.length == getSize()) {
                grow();
            }
            array[getSize()] = person;
            setSize(getSize()+1);

        }

        public int remove(){
            if(getSize() > 0) {
                array[getSize()-1] = null;
                System.out.println("One element removed");
                return setSize(getSize()-1);
            }
            System.out.println("The array is empty");
            return -1;
        }


        public  void remove(int index) {
            HogwartsStudent personToRemove = array[index];

            for(int i = 0; i < array.length; i++) {
                if(array[i] == personToRemove) {

                    for(int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    setSize(getSize()-1);
                }
            }
        }

        public HogwartsStudent[] clear() {
            array = new HogwartsStudent[0];
            setSize(0);
            return array;
        }

        public int getSize() {
            return size;
        }
        public void getLength() {
            System.out.println("Array is: "+ array.length + " elements long"); ;
        }

        public HogwartsStudent getPerson(int index) {
            return array[index];
        }

        public int setSize(int size) {
            this.size = size;
            return size;
        }

        public HogwartsStudent setPerson(int index, HogwartsStudent person) {
            return array[index] = person;
        }

        private HogwartsStudent[] grow() {
            int newSize = array.length + growSize;
            HogwartsStudent[] newArray = new HogwartsStudent[newSize];


            for(int i = 0; i < array.length; i++) {

                newArray[i] = array[i];

            }
            array = newArray;
            System.out.println((array.length));
            return array;

        }

        public boolean canShrink() {
            System.out.println("Array length: " + array.length);
            System.out.println("Size: " + size);
            System.out.println("Grow size: " + growSize);

            boolean result = array.length > size && array.length - size > growSize && array.length - growSize >= INITIAL_SIZE;

            System.out.println("Result: " + result);

            return result;
        }


        @Override
        public String toString() {
            return "DynamicArray{" +
                    "array=" + Arrays.toString(array) +
                    "\nsize " + size +
                    '}';
        }
    }


