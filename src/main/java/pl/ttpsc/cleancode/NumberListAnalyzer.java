package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.OperationNotSupportedException;

public class NumberListAnalyzer {

    Map<Integer, Integer> numbersWithWeights = new HashMap<>();
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public NumberListAnalyzer(List<Integer> numbers) {
        processList(numbers);
    }

    private void processList(List<Integer> numbers) {
        numbers.stream().forEach((value) -> {
            processNumber(value);
        });
    }

    private void processNumber(Integer number) {
        increaseNumberWeightByOne(number);
        updateMin(number);
        updateMax(number);
    }

    private void increaseNumberWeightByOne(Integer number) {
        numbersWithWeights.put(number, numbersWithWeights.getOrDefault(number, 0) + 1);
    }
    
    private void updateMin(Integer number) {
        min = Integer.min(min, number);
    }

    private void updateMax(Integer number) {
        max = Integer.max(max, number);
    }

    public int getNumberWeight(int number) { 
        return numbersWithWeights.getOrDefault(number, 0);
    }

    public double getWeightedAverage() throws OperationNotSupportedException {
        double weightedValuesSum = 0;
        double weightsSum = 0;
        for (Entry<Integer, Integer> numberWithWeight : numbersWithWeights.entrySet()) {
            weightsSum += numberWithWeight.getValue();
            weightedValuesSum += numberWithWeight.getKey() * numberWithWeight.getValue();
        }
        
        if (weightsSum == 0) throw new OperationNotSupportedException();
        
        return weightedValuesSum/weightsSum;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

}