function change() {
    const header = document.getElementsByTagName("H2").item(0);
    // the firstChild of the header is a Text node:
    header.firstChild
    
    const para = document.getElementsByTagName("P").item(0);
    para.firstChild.data = "This is the first paragraph";

    const newText = document.createTextNode
}