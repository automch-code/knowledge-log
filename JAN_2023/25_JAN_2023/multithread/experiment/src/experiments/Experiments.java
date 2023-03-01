package experiments;

public class Experiments {

    public void experiments() throws Exception {
        final String text = "กรุงเทพมหานคร อมรรัตรโกสินทร์ มหินทรายุธยา มหาดิลกภพ นพรัตนราชธานีบูรีรมย์ อุดมราชนิเวศน์มหาสถาน อมรพิมานอวตารสถิต สักกะทัตติยวิษณุกรรมประสิทธิ์\n";
        final StringBuilder sb = new StringBuilder();

        int numberOfThread = 10;
        Thread[] threads = new Thread[numberOfThread];

        class ExperimentsRunnable implements Runnable {
            @Override
            public void run() {
                sb.append(text);
            }//end run
        }// end local class

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ExperimentsRunnable());
            threads[i].start();
        }//end for

        // Wait for all sub-threads finish their task
        for (Thread thread : threads) {
            thread.join();
        }//end for

        System.out.println(sb);

    }//end experiments
}