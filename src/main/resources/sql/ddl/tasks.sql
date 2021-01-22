CREATE TABLE `tasks`
(
    `id`               INT AUTO_INCREMENT,
    `author`           VARCHAR(20) NOT NULL,
    `task_title`       VARCHAR(40) NOT NULL,
    `task_description` TEXT        NOT NULL,
    `task_solution`    TEXT        NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=INNODB