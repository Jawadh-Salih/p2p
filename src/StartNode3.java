public class StartNode3 {
    public static void main(String[] args) {
        //PeerNode peerNode = new PeerNode("127.0.0.1",56551,"node1");
        PeerNode peerNode = new PeerNode("127.0.0.1",56553, "node3");
        //peerNode.getRountingTable();
//        peerNode1.start();
        peerNode.getRountingTable();
        peerNode.getFilesList();
    }
}