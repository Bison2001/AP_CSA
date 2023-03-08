# Create File
## Step 1
Suppose you have already successfully installed VSCODE following this [instruction](). After you open VSCODE, you will see the following picture.
![image](https://user-images.githubusercontent.com/77051146/223616730-50517ab8-f1a5-48ab-9583-b4a5efabe53d.png)

## Step 2
Now, click the button circled by the red line to display file system.
![9c9b82febade7fd52b5681342e1e37e](https://user-images.githubusercontent.com/77051146/223616921-ec733863-42bc-4e96-bc7e-265a20b8e47a.jpg)

## Step 3
Hopefully you see this
![image](https://user-images.githubusercontent.com/77051146/223617382-09aa598c-0614-4400-b0aa-3847567efa8a.png)

## Step 4
Create a folder. If you are a mac user and do not know how to create a folder, follow this [link](https://support.apple.com/zh-cn/guide/mac-help/mh26885/mac#:~:text=On%20your%20Mac%2C%20click%20the,press%20Shift%2DCommand%2DN.)\
Name the folder APCSA.

## Step 5
Click "Open folder" on the screen to open the folder you just created. Hopefully you see this.
![image](https://user-images.githubusercontent.com/77051146/223618080-1d75c6d9-823e-411b-ba5f-2f82df81b88a.png)
The only difference is that I name the fodler `TEST`

## Step 6
Click the icon circled by red line to create a new file
![62dc2a184988b8bbd05c1fb78930dff](https://user-images.githubusercontent.com/77051146/223623372-9bf75956-a070-4e54-abdc-4ac6cd750439.jpg)


## Step 7
Now you can name the file. Here I called it `Anything.java`
![image](https://user-images.githubusercontent.com/77051146/223618593-229ce7d4-3504-4f33-9d80-2a770cdd2184.png)

# Write a java file

## Step 1
You can start to write content in the java file you just created. You first write the following things:
![2b72bab047df1cdca9f226f4b2b1f6c](https://user-images.githubusercontent.com/77051146/223618909-d0a8dcb9-0c0f-4bdd-a2e3-a8107a2ed5c5.jpg)

Notice that you need to ensure the name of the class (circled by the red part) is exactly the same as the file name you just created.

## Step 2
Now write you code like this:
```
class Anything {
    public static void main(String[] args) {
        
    }
}
```
In Java, everything is written inside the `class`. You must use `{}` to enclose everything. Make sure that your `{` and `}` is matched.

```
 public static void main(String[] args) {
        
 }
```
This is called `main` method. That is where your code will be execute. Please make sure that all your code is inside
```
 public static void main(String[] args) {
        
 }
```

# Write some actual code

## Define and initialize variables
you can use `<type> <variable_name> = <value>;` to define and initialize a variable. For example `int a = 5;`
```
class Anything {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println(a);
    }
}
```

## Save and Run
After you finished your code, you can use `cmd`+`s` to save your change on Mac. Now, click the red part to run your code.
![image](https://user-images.githubusercontent.com/77051146/223621990-5254c996-a411-485c-aeda-6fedf39c6d34.png)

## comment and uncomment
You can use `//` before the line of code to let Java ignore the this line
![image](https://user-images.githubusercontent.com/77051146/223622253-6b684264-e69a-4660-83e1-8ebd5430bc65.png)

In this case, 5 will be print out.

## Any red line produced by vscode indicates compile error
Please address all red lines before you run your code.

# Other notice
**PLEASE CREATE A NEW FOLDER EACH TIME YOU DO A NEW HOMEWORK!!!**
