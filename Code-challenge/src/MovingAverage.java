import java.util.List;

/**
 * An MovingAverage interface gives information about the average of last N elements, indexes and nth elements' value
 */
public interface MovingAverage {

    /**
     * The method gives the value of the average of last n elements as requested
     * in the argument. If the argument value is greater than the number of elements
     * present in the list, then the average of all the elements in the list will be given.
     * If the number of elements in the list is zero, then 0 will be returned,
     * @param lastNElements
     * @return
     */
    public double getAverageOfLastNElements(int lastNElements);

    /**
     * value provided as parameter will be added at the end of the list
     * @param element
     */
    public void addElement(int element);

    /**
     * returns all the elements present
     * @return
     */
    public List<Integer> getElements();

    /**
     * returns the value of nth element in the list, if index is not present then -1 will be returned
     * @param index
     * @return
     */
    public int getNthElement(int index);

    /**
     * returns the index of first occurrence of element in the list if the element is not present then -1 will be returned
     * @return
     */
    public int getFirstIndexOfElement(int element );

    /**
     * returns an array that contains all the indexes of an element's occurrence, if element is not present returns empty list
     * @return
     */
    public List<Integer> getAllIndexesOfElement(int element);
}
