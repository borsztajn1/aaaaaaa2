package jjjj9;

import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;
import java.util.*;
//tu NATIVE LIBRARYYYYYY
 //https://docs.opencv.org/2.4/doc/tutorials/introduction/java_eclipse/java_eclipse.html
//tego nie musi byc:
//https://ci.tensorflow.org/view/Nightly/job/nightly-libtensorflow-windows/

}

	public static void main(String[] args) throws Exception {
    try (Graph g = new Graph()) {
      final String value = "Hello from " + TensorFlow.version();
 
      // Construct the computation graph with a single operation, a constant
      // named "MyConst" with a value "value".
      try (Tensor t = Tensor.create(value.getBytes("UTF-8"))) {
        // The Java API doesn't yet include convenience functions for adding operations.
        g.opBuilder("Const", "MyConst").setAttr("dtype", t.dataType()).setAttr("value", t).build();
      }
      System.out.println("TensorFlowExample using TensorFlow version: " +  TensorFlow.version());

      // Execute the "MyConst" operation in a Session.
      try (Session s = new Session(g);
           Tensor output = s.runner().fetch("MyConst").run().get(0)) {
        System.out.println(new String(output.bytesValue(), "UTF-8"));
      }
    }
  }
}