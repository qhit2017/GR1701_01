USE [db_employee]
GO
/****** Object:  Table [dbo].[salary]    Script Date: 12/15/2017 15:35:31 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[salary](
	[id] [nchar](10) NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NOT NULL,
 CONSTRAINT [PK_salary] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
