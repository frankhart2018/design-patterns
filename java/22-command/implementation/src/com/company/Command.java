package com.company;

public interface Command {
    void execute();

    // could add an undo or redo commands
}

class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    // Store previous state for undo, String someState

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // Save previous state, in case undo is called someState = .....;
        this.fileSystemReceiver.openFile();
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}