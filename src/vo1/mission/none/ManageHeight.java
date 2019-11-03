package vo1.mission.none;

public class ManageHeight {

    private int[][] gradeHeights = new int[5][];

    public static void main(String[] args) {

        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();

        for (int i = 1; i <= 5; i++) {
//            manageHeight.printHeight(i);
            manageHeight.printAverage(i);
        }

    }

    private void setData() {
        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{156, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        System.out.println("ClassNo." + classNo);
        for (int data : gradeHeights[classNo - 1]) {
            System.out.println(data);
        }
    }

    public void printAverage(int classNo) {
        double avg = 0;

        for (int data : gradeHeights[classNo - 1]) {
            avg += data;
        }

        System.out.println(avg / gradeHeights[classNo - 1].length);
    }
}
