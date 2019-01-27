import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    private class Interval{
        int start;
        int end;
        Interval(){
            start = 0;
            end = 0;
        }
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    private class IntervalComparator implements Comparator<Interval>{

        @Override
        public int compare(Interval a, Interval b) {
            return Integer.compare(a.start, b.start);
        }
    }

    public List<Interval> merge(List<Interval> intervals){
        Collections.sort(intervals, new IntervalComparator());

        List<Interval> merged = new ArrayList<>();

        Interval last = null;
        for(Interval interval : intervals){
            if (last == null || last.end < interval.start) {
                merged.add(interval);
                last = interval;
            }
            else{
                last.end = Math.max(last.end, interval.end);
            }

        }
        return merged;
    }
}
