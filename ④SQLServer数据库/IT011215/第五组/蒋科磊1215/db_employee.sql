USE [db_staff]
GO
/****** Object:  Table [dbo].[db_staff]    Script Date: 12/15/2017 17:30:38 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[db_staff](
	[id] [int] NOT NULL,
	[salary] [money] NULL,
	[department] [nvarchar](16) NULL,
	[dataline] [date] NULL,
	[recommend] [int] NULL,
	[remarks] [ntext] NULL,
	[age] [tinyint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__db_staff__salary__014935CB]    Script Date: 12/15/2017 17:30:38 ******/
ALTER TABLE [dbo].[db_staff] ADD  DEFAULT ((2000)) FOR [salary]
GO
