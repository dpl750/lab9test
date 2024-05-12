public class Note {
    private int id;
    private String title;
    private String content;

    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter note id: ");
        int id = sc.nextInt();
        System.out.println("Enter note title: ");
        String title = sc.nextLine();
        System.out.println("Enter note content: ");
        String content = sc.nextLine();

        Note note = new Note();
        note.setId(id);
        note.setTitle(title);
        note.setContent(content);

        System.out.println("id: " + note.getId());
        System.out.println("title: " + note.getTitle());
        System.out.println("content: " + note.getContent());
    }
}