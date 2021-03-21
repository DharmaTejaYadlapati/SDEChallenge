import java.util.ArrayList;
import java.util.List;

public class MovingAverageImplementation implements MovingAverage{

    private List<Integer> list = new ArrayList<>();

    @Override
    public double getAverageOfLastNElements(int lastNElements) {
        double totalSum=0.0;
        if(list.size()==0){
            return 0.0;
        }

        if(list.size() < lastNElements){
            for(double value: list){
                totalSum = totalSum+value;
            }

        } else {
            for(int i=list.size()-1;i>=list.size()-lastNElements;i--){
                totalSum = totalSum + list.get(i);
            }
        }
        return totalSum/list.size();
    }

    @Override
    public void addElement(int element) {
        list.add(element);
    }

    @Override
    public List<Integer> getElements() {
        return list;
    }

    @Override
    public int getNthElement(int index) {
        if(index >= list.size() || index < 0){
            return -1;
        }
        return list.get(index-1);
    }

    @Override
    public int getFirstIndexOfElement(int element) {

        return list.indexOf(element);
    }

    @Override
    public List<Integer> getAllIndexesOfElement(int element) {
        List<Integer> indexList = new ArrayList<>();

        for(int i=0; i < list.size(); i++){
            if(element == list.get(i)){
                indexList.add(i);
            }
        }
        return indexList;
    }
}
