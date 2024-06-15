public class Event {
    private String eventName;
    private String description;
    private String date;
    private String venue;
    private String email;
    private String name;
    private int estimatedAttendance;

    // Constructor
    public Event(String eventName, String description, String date, String venue, String email, String name, int estimatedAttendance) {
        this.eventName = eventName;
        this.description = description;
        this.date = date;
        this.venue = venue;
        this.email = email;
        this.name = name;
        this.estimatedAttendance = estimatedAttendance;
    }

    // Getter methods
    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getEstimatedAttendance() {
        return estimatedAttendance;
    }

    // Setter methods
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstimatedAttendance(int estimatedAttendance) {
        this.estimatedAttendance = estimatedAttendance;
    }
}
