INSERT INTO COLLECTION_ENTITY (ID, DISEASE_TERM, TITLE) VALUES
(1, 'Cirrhosis of liver', 'Mothers Pregnancy Samples'),
(2, 'Malignant tumour of breast', 'Phase II multicentre study'),
(3, 'Fit and well', 'Lymphoblastoid cell lines'),
(4, 'Chronic fatigue syndrome', 'Samples available include ME/CFS Cases'),
(5, 'Malignant tumour of breast', 'A randomised placebo-controlled trial');

INSERT INTO SAMPLE_ENTITY (ID, DONOR_COUNT, MATERIAL_TYPE, LAST_UPDATED, COLLECTION_ID) VALUES
(1, 90210, 'Cerebrospinal fluid', '2019-06-03 00:00:00', 4),
(2, 512, 'Cerebrospinal fluid', '2019-03-08 00:00:00', 2),
(3, 7777, 'Core biopsy', '2019-05-04 00:00:00', 2);
