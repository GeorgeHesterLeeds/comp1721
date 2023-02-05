import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset
{
    private ArrayList<Double> data;

    Dataset(String filename) throws FileNotFoundException
    {
        Scanner file;

        file = new Scanner(new File(filename));
        this.data = new ArrayList<Double>();

        while (file.hasNextDouble())
        {
            double input = file.nextDouble();
            this.data.add(input);
        }
    };

    public int size()
    {
        return data.size();
    };

    public double meanValue() throws ArithmeticException
    {
        if (data.isEmpty())
            throw new ArithmeticException("Data list is empty");

        double total = 0;

        for (int i = 0; i < data.size(); i++)
            total += data.get(i);

        return total / data.size();
    };
};