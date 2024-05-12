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
    public static void viewAllNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            System.out.println("All Notes:");
            for (Note note : notes) {
                System.out.println("ID: " + note.getId());
                System.out.println("Title: " + note.getTitle());
                System.out.println("Content: " + note.getContent());
                System.out.println();
            }
        }
    }
    public static void deleteNoteById(int id) {
        Iterator<Note> iterator = notes.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Note note = iterator.next();
            if (note.getId() == id) {
                iterator.remove();
                found = true;
                System.out.println("Note with ID " + id + " deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Note with ID " + id + " not found.");
        }
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