package com.example.jfrmerger;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Repository
public class RecordRepository {

    private final File fileDirectory;

    public RecordRepository(@Value("${record.dir}") String directory) {
        fileDirectory = new File(directory);
        if (!fileDirectory.exists() && !fileDirectory.mkdirs()) {
            throw new RuntimeException("root was not created");
        } else {
            log.info("Init record repository [{}]", fileDirectory.getAbsolutePath());
        }
    }

    public static Map<String, JfrRecord> records = new ConcurrentHashMap<>();

    public Collection<JfrRecord> findRecords() {
        return records.values();
    }

    public List<String> remove(String id) {
        return null;
    }

    public void saveRecord(MultipartFile file) {
        UUID uuid = UUID.randomUUID();

    }
}
