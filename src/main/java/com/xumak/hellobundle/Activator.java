package com.xumak.hellobundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {

     System.out.println("Hello OSGi World Alan Revolorio");

   }

   public void stop(BundleContext context) throws Exception { 

     System.out.println("Goodbye OSGi World!!!!");

   }

}
