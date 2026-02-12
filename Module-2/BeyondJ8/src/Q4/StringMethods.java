package Q4;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Hii";
        System.out.println(s1.repeat(3));

        String s2 = "   Hello World   ";
        System.out.println(s2.strip());
        System.out.println(s2.trim());

        String s3 = "   ";
        System.out.println(s3.isBlank());

        String s4 = "Line1\nLine2";
        System.out.println(s4.indent(4));

        String s5 = "java";
        String result = s5.transform(str -> str.toUpperCase());
        System.out.println(result);

        String s6 = "    Line1\n        Line2\n    Line3";
        System.out.println(s6.stripIndent());

        String s7 = "Hello\\nWorld\\tJava";
        System.out.println(s7.translateEscapes());

        String textBlock = """
                Java
                Sql
                Programming
                """;
        System.out.println(textBlock);

        String s8 = "My name is %s %s";
        System.out.println(s8.formatted("Priyanshu", "Bhushan"));
    }
    }

