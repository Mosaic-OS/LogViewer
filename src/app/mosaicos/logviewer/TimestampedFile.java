package app.mosaicos.logviewer;

import java.io.File;

public record TimestampedFile(File file, long lastModified) {}
