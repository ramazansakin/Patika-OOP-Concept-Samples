package spring;

// Driver class for test cases
public class DIoverIOCUsageSample {

    // "args usage"
    public static void main(String[] args) {

        // Sample usages
        // Create an image processor without DI
        ImageFileProcessor imageFileProcessor = new ImageFileProcessor();

        // use some methods of image processor
        // use with getter or make the editor public
        String result = imageFileProcessor.imageFileEditor.openFile(args[1]);
        // define a fileName as const or local or get from args[]


        // print the results
        System.out.println(result);

        // When we need another type of image editor ?
        // Create a class with different type of file editor

        // Create an image processor DI

        // use some methods of image processor

        // print the results

        // compare with DI and DIless samples



    }

}

// File Editor Interface and common functionalities
interface ImageFileEditor {
    String openFile(String fileName);

    String editFile(String fileName);

    String writeFile(String fileName);

    String saveFile(String fileName);
}

// GIF File Editor Impl
class GifFileEditor implements ImageFileEditor {

    // Interface Method Implementations
    @Override
    public String openFile(String fileName) {
        return "Opening GIF file " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing GIF file " + fileName;
    }

    @Override
    public String writeFile(String fileName) {
        return "Writing GIF file " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving GIF file " + fileName;
    }
}

// Sample Image Processor File without DI pattern
class ImageFileProcessor {

    // Autowiring injection
    // "Qualifier" usage

    public ImageFileEditor imageFileEditor;

    // "constructor injection"
    public ImageFileProcessor() {
        this.imageFileEditor = new GifFileEditor();
    }

    // setter injection
    public void setImageFileEditor(ImageFileEditor imageFileEditor) {
        this.imageFileEditor = imageFileEditor;
    }


    // Getter for image file editor

}


// PNG File Editor Impl
class PngFileEditor implements ImageFileEditor{

    @Override
    public String openFile(String fileName) {
        return null;
    }

    @Override
    public String editFile(String fileName) {
        return null;
    }

    @Override
    public String writeFile(String fileName) {
        return null;
    }

    @Override
    public String saveFile(String fileName) {
        return null;
    }
}