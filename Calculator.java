// Dentro del método main, después de la bienvenida
   System.out.println("Ingrese el primer número para la suma:");
   double num1 = scanner.nextDouble();

   System.out.println("Ingrese el segundo número para la suma:");
   double num2 = scanner.nextDouble();

   double result = num1 + num2;
   System.out.println("El resultado de la suma es: " + result);

// Añadir después de la implementación de la suma
   System.out.println("Ingrese el primer número para la resta:");
   double num3 = scanner.nextDouble();

   System.out.println("Ingrese el segundo número para la resta:");
   double num4 = scanner.nextDouble();

   double resultSub = num3 - num4;
   System.out.println("El resultado de la resta es: " + resultSub);

   // Añadir después de la implementación de la resta
   System.out.println("Ingrese el primer número para la multiplicación:");
   double num5 = scanner.nextDouble();

   System.out.println("Ingrese el segundo número para la multiplicación:");
   double num6 = scanner.nextDouble();

   double resultMul = num5 * num6;
   System.out.println("El resultado de la multiplicación es: " + resultMul);


// Reemplazar las lecturas de números con validación
           System.out.println("Ingrese el primer número para la división:");
           while (!scanner.hasNextDouble()) {
           System.out.println("Entrada inválida. Por favor, ingrese un número:");
           scanner.next();
           }
           double num7 = scanner.nextDouble();

// Repetir el mismo proceso para num8
