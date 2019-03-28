public class Console {

    private String text;

    public Console(String text) {
        this.text = "\033[m"+text+"\033[0m";
    }

    /**
     * Write text that customized.
     */
    public void done() {
        System.out.print(text);
    }

    /**
     * Write text that customized then go next line.
     */
    public void doneln() {
        System.out.println(text);
    }

    public Console bold(){
        this.text = this.text.replaceFirst("m" , "1;m");
        return this;
    }

    public Console italic(){
        this.text = this.text.replaceFirst("m" , "3;m");
        return this;
    }

    public Console underline(){
        this.text = this.text.replaceFirst("m" , "4;m");
        return this;
    }

    public Console black(){
        this.text = this.text.replaceFirst("m" , "30;m");
        return this;
    }

    public Console red(){
        this.text = this.text.replaceFirst("m" , "31;m");
        return this;
    }

    public Console green(){
        this.text = this.text.replaceFirst("m" , "32;m");
        return this;
    }

    public Console yellow(){
        this.text = this.text.replaceFirst("m" , "33;m");
        return this;
    }

    public Console blue(){
        this.text = this.text.replaceFirst("m" , "34;m");
        return this;
    }

    public Console purple(){
        this.text = this.text.replaceFirst("m" , "35;m");
        return this;
    }

    public Console cyan(){
        this.text = this.text.replaceFirst("m" , "36;m");
        return this;
    }

    public Console grey(){
        this.text = this.text.replaceFirst("m" , "37;m");
        return this;
    }

    public Console white(){
        return this;
    }

    public void finalize(){
        this.text = null;
    }

    public String toString() {
        return this.text;
    }
}
