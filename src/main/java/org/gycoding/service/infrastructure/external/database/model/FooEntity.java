package org.gycoding.service.infrastructure.external.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Foo")
public class FooEntity {
    @Id
    private String mongoId;

}