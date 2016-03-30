package ru.mti.edu.multithread;

import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorsServiceTest {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		//TODO: действия
		lock.unlock();
		
		AtomicInteger a = new AtomicInteger(15);
		int rest = a.addAndGet(-500);
		
		ExecutorService executorService = Executors.newFixedThreadPool(1024);
		executorService.execute(
			new Runnable() {
				@Override
				public void run() {
//					if (true) throw new IllegalArgumentException();
					System.out.println(Thread.currentThread().getName() + ": Hello World");
				}
			});

		Future<Integer> future = executorService.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int result = 5 + 5;
				System.out.println(Thread.currentThread().getName() + ": " + result);
				return result;
			}
		});
		executorService.shutdown();
		try {
			executorService.awaitTermination(5, TimeUnit.SECONDS);
			if (!executorService.isTerminated()){
				executorService.shutdownNow();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
