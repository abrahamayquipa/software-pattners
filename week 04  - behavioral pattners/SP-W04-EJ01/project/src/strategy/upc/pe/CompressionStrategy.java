package strategy.upc.pe;

import java.io.File;
import java.util.ArrayList;

public interface CompressionStrategy {
  public void compressFiles(ArrayList<File> files);

}