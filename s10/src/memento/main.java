package memento;

public class main {
    public static void main(String[] args) {
        File file = new File("amjdsokso", "100", "users/Alina/Documents", "Fisier_cts");

        FileSnapshot fileSnapshot = file.createSnapShot();
        System.out.println(file);
        System.out.println(fileSnapshot.getDetails());
        file.setContent("absv");

        VersionControl git = new VersionControl();
        git.addFileSnapshot(fileSnapshot);
        FileSnapshot fileSnapshot2 = file.createSnapShot();
        System.out.println(file.print());
        System.out.println(fileSnapshot2.getDetails());

        git.addFileSnapshot(fileSnapshot2);
        file.restoreToSomePoint(fileSnapshot);
        System.out.println(file.print());

        git.listSnapshotList();
    }
}
