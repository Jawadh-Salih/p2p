import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StartNode {
    public static void main(String[] args) {
        int port = ThreadLocalRandom.current().nextInt(1050, 50000);
        PeerNodeNew node = new PeerNodeNew("127.0.0.1",port,"node" + port);
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("What you want to do?");
            System.out.println("1. Search for a file");
            System.out.println("2. Print File Names for a node.");
            System.out.println("3. Print Routing table for a node.");
            System.out.println("4. Previous queries.");
            System.out.println("5. Rank a file.");
            System.out.println("6. Get file rank.");

            int selection = Integer.parseInt(in.nextLine().trim());
            switch (selection){
                case 1:
                    System.out.println("Enter Search Query :");
                    String query = in.nextLine();
                    node.searchFileQuery(query);
                    break;
                case 2:
                    System.out.println("Print File Names for a node.");
                    node.getFilesList();
                    break;
                case 3:
                    System.out.println("Print Routing table for a node.");
                    node.getRountingTable();
                    break;
                case 4:
                    System.out.println("Previous queries.");
                    node.getPreviousQueries();
                    break;
                case 5:
                    System.out.println("Enter file name: ");
                    String fileName = in.nextLine();
                    System.out.println("fileName:"+fileName);
                    System.out.println("Enter rank: ");
                    int rank = Integer.parseInt(in.nextLine().trim());
                    System.out.println("Rank:"+rank);
                    node.rankFile(fileName,rank);
                    break;
                case 6:
                    System.out.println("Enter file name: ");
                    String queryName = in.nextLine();
                    System.out.println("queryName:"+queryName);
                    node.getFileRank(queryName);
                    break;
                default:
                    System.out.println("No matching input.");
            }
        }
    }
}
