package springpack.com;

import java.nio.file.spi.FileSystemProvider;
import java.security.KeyStore.Entry;
import java.util.*;

public class Beanclass2 
{
	private List<String> stdnames;
	private Set<Integer> rollnums;
	private Map<String,Integer> branchdetails;
	private Properties branchhodinfo;
	public Beanclass2() {
		super();
	}
	public List<String> getStdnames() {
		return stdnames;
	}
	public void setStdnames(List<String> stdnames) {
		this.stdnames = stdnames;
	}
	public Set<Integer> getRollnums() {
		return rollnums;
	}
	public void setRollnums(Set<Integer> rollnums) {
		this.rollnums = rollnums;
	}
	public Map<String, Integer> getBranchdetails() {
		return branchdetails;
	}
	public void setBranchdetails(Map<String, Integer> branchdetails) {
		this.branchdetails = branchdetails;
	}
    public Properties getBranchhodinfo() {
		return branchhodinfo;
	}
	public void setBranchhodinfo(Properties branchhodinfo) {
		this.branchhodinfo = branchhodinfo;
	}
	public void displaynames()
    {
    	System.out.println("--List of Names--");
    	for(String sn:stdnames)
    	{
    		System.out.println(sn);
    	}
    }
    public void displayrollnums()
    {
    	System.out.println("--List of Roll-Numbers--");
    	for(Integer sn:rollnums)
    	{
    		System.out.println(sn);
    	}
    }
    public void displaybranchdetails()
    {
    	System.out.println("--List of BranchSetails--");
    	for(Map.Entry<String,Integer> sn:branchdetails.entrySet())
    	{
    		System.out.println(sn);
    	}
    }
    public void displayBranchhodinfo()
    {
    	System.out.println("--List of Branchhodinfo---");
    	Set<String> sk=branchhodinfo.stringPropertyNames();
    	for(String s:sk)
    	{
    		System.out.println(s+" "+branchhodinfo.getProperty(s));
    	}
    	
    }
}
