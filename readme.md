1、Reactor has four dispatchers to pick from: synchronous, ring buffer, thread pool, and event loop.

Synchronous is typically used inside a consumer, especially if you use Stream s and Promise s.
Ring buffer is used for large volumes of non-blocking events and is based on the LMAX disruptor.
Thread pool is ideal for longer running tasks that might be IO bound, and when it doesn’t matter what thread they are run on.
Event loop is used when you need all events on the exact same thread.