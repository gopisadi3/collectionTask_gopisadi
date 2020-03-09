package Epam_gopisadi.design_pattern;


import java.util.Arrays;


public class collections<E> {
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("collections.class");

	private int size = 0;
    
   
    private static final int Intialcapacity = 10;  //intial capacity
     
    
    private Object elements[];
 
    
    public collections() {
        elements = new Object[Intialcapacity];
    }
 
  
    public void addele(E e) {    //e is argument and E type of object
    	Logger.info("add element Method");
        if (size == elements.length) {
            increase_Capacity();
        }
        elements[size++] = e;
    }
     
    
   
    public E getvalue(int i) {
    	Logger.info("getvalue Method");
        if (i >= size || i < 0) {
        	Logger.error("i is greater than given length (or) less than 0 ");
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i]; 
    }
     
    
   
    public E remove(int i) { 
    	Logger.info("Remove  Method");
        if (i >= size || i < 0) {
        	Logger.error("i is greater than given length (or) less than 0 ");

            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ; 
        size--;
        return (E) item;
    }
     
    
    public int size() {    
        return size;
    }
     
   
    
    public String toString()     
    {
         StringBuilder strbui = new StringBuilder();
         strbui.append('[');
         for(int j = 0; j< size ;j++) {
             strbui.append(elements[j].toString());  
             if(j<size-1){
                 strbui.append(",");
             }
         }
         strbui.append(']');
         return strbui.toString();
    }
     
    private void increase_Capacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize); 
    }
}
