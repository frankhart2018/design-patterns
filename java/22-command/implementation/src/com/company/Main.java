package com.company;

public class Main {

    public static void main(String[] args) {
        // Creating the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // Create the command with the associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // Creae invoker and associate it with the command
        FileInvoker file = new FileInvoker(openFileCommand);

        // Perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
