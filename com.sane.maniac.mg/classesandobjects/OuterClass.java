package com.sane.maniac.mg.classesandobjects;

public class OuterClass {
    static class StaticNestedClass {
        private int staticNestedField = 5;

        public void doSomething() {
            System.out.println("StaticNestedClass.doSomething()\nstaticNestedField = " + staticNestedField);
        }
    }

    class NestedClass {
        private int nestedField = 10;

        public void doSomething() {
            System.out.println("NestedClass.doSomething()\nnestedField = " + nestedField);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.doSomething();

        OuterClass outerClass = new OuterClass();
        OuterClass.NestedClass nestedClass = outerClass.new NestedClass();
        nestedClass.doSomething();

        class LocalClass {
            private int localField = 15;

            public void doSomething() {
                System.out.println("LocalClass.doSomething()\nlocalField = " + localField);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.doSomething();

        Runnable anonymousClass = new Runnable() {
            private int anonymousField = 20;

            @Override
            public void run() {
                System.out.println("AnonymousClass.run()\nanonymousField = " + anonymousField);
            }
        };

        anonymousClass.run();
    }
}
