package idrandom;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import java.util.Random;

public class ThaiIDGenerator {
  public static void main(String[] args) {
    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setText("Thai ID Generator");
    shell.setLayout(new RowLayout(SWT.VERTICAL));

    final Label lblThaiID = new Label(shell, SWT.NONE);
    lblThaiID.setText("Thai ID: ");
    lblThaiID.setBounds(10,10,400,20);


    Button btnGenerate = new Button(shell, SWT.NONE);
    btnGenerate.setText("Generate");
    btnGenerate.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        ThaiID id = new ThaiID();
        lblThaiID.setText("Thai ID: " + id.getID());

      }
    });

    shell.pack();
    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch()) {
        display.sleep();
      }
    }
    display.dispose();
  }
}