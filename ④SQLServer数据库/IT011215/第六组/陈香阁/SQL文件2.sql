USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/17/2017 20:28:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[recommend] [int] NULL,
	[remarks] [ntext] NOT NULL,
	[age] [tinyint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tb_db_employee]    Script Date: 12/17/2017 20:28:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_db_employee](
	[id] [tinyint] NOT NULL,
	[name] [smallint] NOT NULL,
 CONSTRAINT [PK_tb_db_employee] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_employ__salar__014935CB]    Script Date: 12/17/2017 20:28:11 ******/
ALTER TABLE [dbo].[tb_employee] ADD  DEFAULT ((3000)) FOR [salary]
GO
